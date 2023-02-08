/**
 * @author : Ishara Maduarnga
 * Project Name: Spring_File_Uploader
 * Date        : 2/8/2023
 * Time        : 12:11 PM
 * Year        : 2023
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileHandleController {
    public FileHandleController() {
        System.out.println("FileHandleController ");
    }
}