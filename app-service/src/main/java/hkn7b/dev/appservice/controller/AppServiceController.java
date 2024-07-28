package hkn7b.dev.appservice.controller;

import hkn7b.dev.appservice.entity.HttpRespMsg;
import hkn7b.dev.appservice.enumeration.ErrorReason;
import hkn7b.dev.appservice.exception.AppServiceException;
import hkn7b.dev.appservice.service.TeamMemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/app")
public class AppServiceController {

    private final TeamMemberService teamMemberService;

    public AppServiceController(TeamMemberService teamMemberService) {
        this.teamMemberService = teamMemberService;
    }

    @GetMapping(path = "/livenessProbe",
                name = "livenessProbe",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> livenessProbe() throws AppServiceException {
        return new ResponseEntity<>("Liveness Probe successfully established!", HttpStatus.OK);
    }

    @ExceptionHandler(AppServiceException.class)
    ResponseEntity<HttpRespMsg> appServiceException(AppServiceException e) {
        return ResponseEntity.badRequest().body(new HttpRespMsg(ErrorReason.TEAM_MEMBER_COLLECTION_EMPTY.name()));
    }
}
