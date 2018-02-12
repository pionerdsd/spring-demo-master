package com.example.demo;

import com.example.repository.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    private final VisitsRepository visitsRepository;
    private final UsersRepository usersRepository;

    public IndexController(VisitsRepository visitsRepository, UsersRepository usersRepository) {
        this.visitsRepository = visitsRepository;
        this.usersRepository = usersRepository;
    }

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Alexey");

        Visit visit = new Visit();
        visit.description = String.format("Visited at %s", LocalDateTime.now());
        visitsRepository.save(visit);

        return new ModelAndView("index", model);
    }


@RequestMapping(value="/test")
public String indexPage() {

    return "test";
}
}
