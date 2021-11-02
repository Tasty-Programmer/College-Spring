package edu.dl.project01.controller;

import edu.dl.project01.domain.Member;
import edu.dl.project01.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/members") public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }

    @GetMapping(value = "/members/new")
    public String createForm(Model model) {
        model.addAttribute("memberForm", new MemberForm());
        return "members/createMemberForm";
    }

    @PostMapping(value = "/members/new")
//    public String create(@Valid MemberForm form, BindingResult result) {
        public String create(MemberForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "members/createMemberForm";
        }
        Member member = new Member();
        member.setId((form.getId()));
        member.setName(form.getName());
        member.setEmail(form.getEmail());
        member.setPhone(form.getPhone());
        member.setAddress(form.getAddress());
        member.setZipcode(form.getZipcode());
        memberService.join(member);
        return "redirect:/";
    }
}
