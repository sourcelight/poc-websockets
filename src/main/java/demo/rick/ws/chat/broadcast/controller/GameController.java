/**
 * @author: Riccardo_Bruno
 * @project: ws.chat.broadcast
 */


package demo.rick.ws.chat.broadcast.controller;

import demo.rick.ws.chat.broadcast.handler.GameWebSocketHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class GameController {

    private final GameWebSocketHandler gameWebSocketHandler;

    public GameController(GameWebSocketHandler gameWebSocketHandler) {
        this.gameWebSocketHandler = gameWebSocketHandler;
    }

    @GetMapping("/send")
    public String sendMessage(String message) throws IOException {
        gameWebSocketHandler.sendMessage(message);
        return "Message sent: " + message;
    }
}
