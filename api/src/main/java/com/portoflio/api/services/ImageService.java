package com.portoflio.api.services;

import com.portoflio.api.models.Image;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

public interface ImageService {
    String addImage(String title, MultipartFile file) throws IOException;
    Image getImage(String id);
    void deleteImage(String id);
    String save(Image image);
}
