package estudy.in.simple.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestEnpoints {
    @RequestMapping("/course")
    public Course getEndpoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
                              @RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount
    ) {
        return new Course(name, chapterCount);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course) {
        return "your course named" + course.getName() + "with" + course.getChapterCount() + "chpter saved succesfully";
    }
}