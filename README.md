# POC broadcast chat



In the case I want to send messages to all players(no one excluded)
please use the controller action:

<pre>
curl http://localhost:8080/api/send?message=HelloPlayers
</pre>


Summary:
- WebSocket Communication: The WebSocket client (index.html) communicates directly with the WebSocket handler (GameWebSocketHandler) via the WebSocket URL.
- WebSocket Handler: The handler processes WebSocket connections and messages.
- REST Controller: Provides additional functionality for server-side communication with WebSocket clients, enabling features like broadcasting messages, initializing data, or admin operations.