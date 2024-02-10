package com.mvc.web.controller;

import com.mvc.web.dto.ClubDto;
import com.mvc.web.service.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {
    private ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }
    @GetMapping("/clubs")
    public String listClubs(Model model){
        List<ClubDto> clubs = clubService.getAllClubs();
        model.addAttribute("clubs", clubs);
        return "clubs-list";

    }
}
