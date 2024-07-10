package com.tttn.webthitracnghiem.api;

import com.tttn.webthitracnghiem.model.Subject;
import com.tttn.webthitracnghiem.model.SubjectRequest;
import com.tttn.webthitracnghiem.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subject")
public class SubjectApiController {
    @Autowired
    private ISubjectService subjectService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Subject> save(@ModelAttribute SubjectRequest subjectRequest){
        return ResponseEntity.ok(subjectService.save(subjectRequest));
    }
}
