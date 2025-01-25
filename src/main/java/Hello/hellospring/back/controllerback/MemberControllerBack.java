/*
package Hello.hellospring.back.controllerback;

import Hello.hellospring.back.domainback.MemberBack;
import Hello.hellospring.back.serviceback.MemberServiceBack;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberControllerBack {

    private final MemberServiceBack memberServiceBack;

    @Autowired
    public MemberControllerBack(MemberServiceBack memberServiceBack) {
        this.memberServiceBack = memberServiceBack;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberFormBack form) {
        MemberBack memberBack = new MemberBack();
        memberBack.setName(form.getName());

        memberServiceBack.join(memberBack);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<MemberBack> memberBacks = memberServiceBack.findMembers();
        model.addAttribute("members", memberBacks);
        return "members/memberList";
    }
}
*/
