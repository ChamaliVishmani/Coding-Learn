package com.chamali.dreamShops.model;

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
@Entity // Denotes that this class is a table in the database
public class Image {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity strategy to generate primary key
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;
    private String downloadUrl;

    @ManyToOne // Many images to one product
    @JoinColumn(name="product_id") // Join by column id of product
    private  Product product;
}
