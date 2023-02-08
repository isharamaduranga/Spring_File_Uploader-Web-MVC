/**
 * @author : Ishara Maduarnga
 * Project Name: Spring_File_Uploader
 * Date        : 2/8/2023
 * Time        : 12:11 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileHandleController {

    @GetMapping("get")
    public ResponseEntity<byte[]> getImage() throws IOException {
        Path path = Paths.get("D:\\upload\\" + "abc.jpg");
        byte[] image = Files.readAllBytes(path);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        headers.setContentLength(image.length);

        return new ResponseEntity<>(image, headers, HttpStatus.OK);
    }


    @PostMapping("post")
    public ResponseEntity<String>  uploadImage(@RequestParam("imageFile") MultipartFile imageFile) throws IOException {

        // Save the image to the file system or database
        byte[] bytes = imageFile.getBytes();
        Path path = Paths.get("D:\\upload\\" + imageFile.getOriginalFilename());
        Files.write(path, bytes);

        // Return the Success message
        return ResponseEntity.ok("Image uploaded successfully.");
    }

}
