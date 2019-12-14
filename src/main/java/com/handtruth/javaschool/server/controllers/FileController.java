package com.handtruth.javaschool.server.controllers;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping(value = "/file")
public class FileController {

    private static final String resource = "/Users/lexcorp/IdeaProjects/javaschool-server/src/main/resources/static";

    @GetMapping(value = "/image/{id}", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable String id) {
        File file = new File(resource.concat("/" + id).concat(".png"));
        return getResponseEntity(file);
    }

    @GetMapping(value = "/doc/{id}", produces = MediaType.TEXT_MARKDOWN_VALUE)
    public ResponseEntity<byte[]> getDoc(@PathVariable String id) {
        File file = new File(resource.concat("\\" + id).concat(".adoc"));

        return getResponseEntity(file);
    }

    @GetMapping(value = "/text/{id}")
    public ResponseEntity<String> getText(@PathVariable String id) throws IOException {
        File file = new File(resource.concat("/" + id).concat(".txt"));
        BufferedReader reader = new BufferedReader( new FileReader(file));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.OK);

//        return getResponseEntity(file);
    }

    private ResponseEntity<byte[]> getResponseEntity(File file) {
        byte[] bytes;
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            bytes = IOUtils.toByteArray(in);
        } catch (IOException ex) {
            return new ResponseEntity<>(new byte[]{}, HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<byte[]>(bytes, HttpStatus.CREATED);
    }
}
