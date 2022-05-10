package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@Controller

public class SkillsController {
    @GetMapping
    public String createHomepage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Skills and stuff!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String createForm() {
        return "<html>" +
                "<body>" +
                "<form action='results' method='post'>" +
                "<label>Name<br><input type='text' name='name' /></label><br>" +
                "<label>My favorite language:<br>" +
                "<select name=\"firstlang\" id=\"firstlang\">" +
                    "<option value=\"Java\">Java</option>" +
                    "<option value=\"Javascript\">Javascript</option>" +
                    "<option value=\"Ruby\">Ruby</option>" +
                "</select>" +
                "</label>" +


                "<br><label>My second favorite language:<br>" +
                "<select name=\"secondlang\" id=\"secondlang\">" +
                    "<option value=\"Java\">Java</option>" +
                    "<option value=\"Javascript\">Javascript</option>" +
                    "<option value=\"Ruby\">Ruby</option>" +
                "</select>" +
                "</label>" +


                "<br><label>My third favorite language:<br>" +
                "<select name=\"thirdlang\" id=\"thirdlang\">" +
                    "<option value=\"Java\">Java</option>" +
                    "<option value=\"JavaScript\">Javascript</option>" +
                    "<option value=\"Ruby\">Ruby</option>" +
                "</select>" +
                "</label>" +

                "<br><input type='submit' value='Submit'>" +

                "</body>" +
                "</html>";
    }
    @PostMapping("/results")
    @ResponseBody
    public String respondToFormSubmission(@RequestParam String name,
                                          @RequestParam String firstlang,
                                          @RequestParam String secondlang,
                                          @RequestParam String thirdlang) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr><th>First Language</th><th>Second Language</th><th>Third Language</tr>" +
                "<tr><td>" + firstlang + "</td><td>" + secondlang + "</td><td>" + thirdlang +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
