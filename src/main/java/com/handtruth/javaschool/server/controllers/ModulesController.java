package com.handtruth.javaschool.server.controllers;

import com.handtruth.javaschool.server.model.Lesson;
import com.handtruth.javaschool.server.model.ModuleInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.handtruth.javaschool.server.controllers.Constants.*;

@RestController
@RequestMapping(value = "/modules")
public class ModulesController {

    private List<ModuleInfo> moduleInfos = Arrays.asList(
            new ModuleInfo(0, "Kotlin", 5, 10, 10,  kotlin_descr,  "kotlin"),
            new ModuleInfo(1, "Java",   5, 11, 10,  java_descr,     "java"),
            new ModuleInfo(2, "Python", 5, 12, 10,  python_descr,   "python"),
            new ModuleInfo(3, "C++",    5, 13, 15,  cpp_descr,      "cpp"),
            new ModuleInfo(4, "C#",     5, 14, 10,  csharp_descr,   "csharp"),
            new ModuleInfo(5, "Pascal", 3, 15, 5,   pascal_descr,   "pascal")
    );

    @GetMapping(value = "/info")
    public List<ModuleInfo> getModuleInfo() {
        return moduleInfos;
    }

    @GetMapping(value = "/info/{id}")
    public ModuleInfo getModuleInfo(@PathVariable("id") int id) {
        for (ModuleInfo m: moduleInfos) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    int i  = 0;
    @GetMapping(value = "/{id}")
    public List<Lesson> getModulesById(@PathVariable("id") int id) {
        return Arrays.asList(
                new Lesson(0 + 3*id, id, "Hello world", 1, "Kotlin", getFileTextById("testfile")),
                new Lesson(1 + 3*id, id, "Lesson 2",    1, "Kotlin", "chapter01"),
                new Lesson(2 + 3*id, id, "Lesson 3",    1, "Kotlin", "chapter02")
        );
    }


    private static final String resource = "/Users/Alex/IdeaProjects/javaschool-server/src/main/resources/static";

    private String getFileTextById(String id) {
        File file = new File(resource.concat("/" + id).concat(".txt"));
        StringBuilder stringBuilder;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
