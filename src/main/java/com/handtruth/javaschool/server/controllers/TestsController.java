package com.handtruth.javaschool.server.controllers;

import com.handtruth.javaschool.server.model.ModuleTests;
import com.handtruth.javaschool.server.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/tests")
public class TestsController {
    private int i = 0;
    private int j = 0;

    @GetMapping(value = "/{id}")
    public List<ModuleTests> getLessonTestsById(@PathVariable("id") int id) {
        return Arrays.asList(
                new ModuleTests(0 + 2*id, id, "Lesson 1", 3),
                new ModuleTests(1 + 2*id, id, "Lesson 2", 3)
        );
    }

    @GetMapping(value = "/test/{id}")
    public List<Test> getTestsById(@PathVariable("id") int id) {
        return Arrays.asList(
                new Test(0 + 7*id, id, 0 + 2*id, "", "5 + 5 = ?",  "6", "7", "8", "10",   4),
                new Test(1 + 7*id, id, 0 + 2*id, "", "5 + 6 = ?",  "11", "7", "8", "10",  1),
                new Test(2 + 7*id, id, 0 + 2*id, "", "2 * 5 = ?",  "6", "10", "8", "11",  2),
                new Test(3 + 7*id, id, 1 + 2*id, "", "5 + 4 = ?",  "6", "9", "8", "10",   2),
                new Test(4 + 7*id, id, 1 + 2*id, "", "5 + 9 = ?",  "11", "7", "14", "10", 3),
                new Test(5 + 7*id, id, 1 + 2*id, "", "15 / 5 = ?", "6", "2", "5", "3",    4)
        );
    }
}
