package com.web.psh1;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.web.psh1.dao.V3_BoardDAO;
import com.web.psh1.vo.V3_Board;
import com.web.psh1.vo.V3_BoardImg;

@Controller
public class BoardController {

	@Autowired
	private V3_BoardDAO bDAO = null;

	@RequestMapping(value = "/board.do", 	method = RequestMethod.GET)
	public String board(Model model,@RequestParam(value="page",defaultValue="1") int page) {
		List<V3_Board> list = bDAO.selectlist(page);
		model.addAttribute("list",list);
		return "board";
	}
	
	@RequestMapping(value = "/boardwrite.do", method = RequestMethod.GET)
	public String boardwrite(HttpSession httpsession, Model model) {
		//세션에서 이메일 값을 받아옴
		String email = (String)httpsession.getAttribute("_email");
		
		//이메일 값이 없다면 로그인이 되지 않은 상태
		if(email == null) {
			//로그인 화면으로 이동시킴
			return "redirect:login.do";
		}

		//1. 전달할 VO를 생성
		V3_Board vo = new V3_Board();
		
		//2. 글번호를 DAO에서 가져옴.
		int no = bDAO.getlastno();
		String name = (String)httpsession.getAttribute("_name");
		
		//3. 전달할 값을 넣음(글번호, 작성자)
		vo.setNo(no+1);
		vo.setWriter(name);
		
		//4. jsp로 V3_Board의 객체 vo를 전달함.
		model.addAttribute("bvo", vo);

		//5. 조건문으로 진입하지 않았다면 로그인 되어 있다면 글쓰기 화면을 표시
		return "boardwrite";
	}

	@RequestMapping(value = "/boardwrite.do", method = RequestMethod.POST)
	public String boardwrite(HttpSession httpsession, 
			@ModelAttribute("bvo") V3_Board vo,
			MultipartHttpServletRequest request) {
		try {
			// v3_board테이블에 추가
			int ret = bDAO.insert(vo);
			if (ret > 0) { //board에 추가했을 경우
				Map<String, MultipartFile> map = request.getFileMap();
				for (int i = 0; i < map.size(); i++) {
					MultipartFile one = map.get("file_" + i);
					V3_BoardImg vo1 = new V3_BoardImg();
					vo1.setFILENAME(one.getOriginalFilename()); // 파일명
					vo1.setFILEDATA(one.getBytes()); // 파일 데이터
					vo1.setBOARD_NO(vo.getNo()); // 게시판 글번호
					bDAO.insertimg(vo1);
				}
				return "redirect:board.do";
			}

			return "redirect:boardwrite.do";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "redirect:boardwrite.do";
		}
	}


}
