package com.chamali.dreamShops.service.image;

import com.chamali.dreamShops.dto.ImageDto;
import com.chamali.dreamShops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImage(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file,Long imageId);
}
