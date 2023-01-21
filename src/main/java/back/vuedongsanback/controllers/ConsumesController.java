package back.vuedongsanback.controllers;

import back.vuedongsanback.models.Consume;
import back.vuedongsanback.models.Consumes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/consumes")
public class ConsumesController {
    private static Consumes init() {
        List<Consume> consumes = new ArrayList<>();
        consumes.add(new Consume(1, 39));
        consumes.add(new Consume(2, 33));
        consumes.add(new Consume(3, 44));
        consumes.add(new Consume(4, 22));
        consumes.add(new Consume(5, 10));
        return new Consumes(5000, 1999, consumes);
    }
    public static final Consumes cunsumes = init();

//    @RequestMapping(path = "", method = RequestMethod.POST)
//    public MembersResponse membersCreate(@RequestBody Member member) {
//        members.add(member);
//        return new MembersResponse("created");
//    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    // public MembersResponse membersRead(@ModelAttribute Member member) {
    // public MembersResponse membersRead(@RequestParam("name") String title, @RequestParam(required=false, defaultValue="1") int age) {
    public Consumes membersRead() {
        return cunsumes;
    }
//
//    @RequestMapping(path = "/{index}", method = RequestMethod.DELETE)
//    public MembersResponse membersDelete(@PathVariable("index") int index) {
//        members.remove(index);
//        return new MembersResponse("deleted");
//    }
//
//    @RequestMapping(path = "/{index}", method = {RequestMethod.PUT, RequestMethod.PATCH})
//    public MembersResponse membersUpdate(
//            @PathVariable("index") int index,
//            @RequestBody Member member
//    ) {
//        members.set(index, member);
//        return new MembersResponse("updated");
//    }
}