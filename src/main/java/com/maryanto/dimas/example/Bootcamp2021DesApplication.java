package com.maryanto.dimas.example;

import com.maryanto.dimas.example.model.Mahasiswa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Bootcamp2021DesApplication {

    @Bean
    public String getNama() {
        return "Dimas Maryanto";
    }

    @GetMapping("/api/mahasiswa")
    public Mahasiswa getMahasiswa() {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Dimas Maryanto");
        mhs.setNip("123456");
        mhs.setKelas("IT");
        return mhs;
    }

    @PostMapping("/api/mahasiswa")
    public Mahasiswa getMahasiswa(@RequestBody Mahasiswa mhs) {
        return mhs;
    }

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Bootcamp2021DesApplication.class, args);

        String value = run.getBean("getNama", String.class);
        System.out.println("value: " + value);
    }

}
