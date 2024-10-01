package com.example.backendapp.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String fileType;

    @Lob
    private Blob image;
    private String url;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
