package it.api;

import it.model.Person;
import it.repository.PersonRepository;
import it.service.PersonRepisotryIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Component
@Controller
public class MyController {


    private final PersonRepository personRepository;


    @Autowired
    public MyController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String findAll(Model model) {
        model.addAttribute("find", personRepository.findAll());
        return "menu";
    }

    @GetMapping("form")
    public String form() {
        return "saveForm";
    }

    @PostMapping("save")
    public String save(
            @RequestParam("name") String name,
            @RequestParam("age") int age
    ) {
        Person user = new Person();
        user.setName(name);
        user.setAge(age);
        personRepository.save(user);
        return "redirect:/";
    }

    @GetMapping("update/form/{id}")
    public String updateForm(
            @PathVariable Long id,
            Model model
    ) {
        Person user = personRepository.findById(id);
        model.addAttribute("key", user);
        return "formUpdate";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable Long id,
            @RequestParam String name,
            @RequestParam int age
    ) {
        Person user = personRepository.findById(id);
        user.setName(name);
        user.setAge(age);
        personRepository.update(user, id);
        return "redirect:/";
    }

    @GetMapping("delete/{id}")
    public String deleteById(@PathVariable Long id) {
        personRepository.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("/find/by/{id}")
    public String findById(@PathVariable Long id, Model model) {
        Person person = personRepository.findById(id);
        model.addAttribute("person", person);
        return "personDetails";
    }
}
