package com.wilderness.boot.controller;

import com.wilderness.boot.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author an_qiang
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/{id}")
    public Response home(@PathVariable Integer id) {
        return Response.ok().setMsg(String.format("id: %d, time: %d", id, System.currentTimeMillis()));
    }
}
