/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.kaazing.gateway.client.impl.autobahn.pingsandpongs;

import java.net.URI;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import org.kaazing.net.ws.WebSocket;
import org.kaazing.net.ws.WebSocketFactory;
import org.kaazing.robot.junit.annotation.Robotic;
import org.kaazing.robot.junit.rules.RobotRule;

public class PingsAndPongsIT {

    @Rule
    public RobotRule robot = new RobotRule();

    @Robotic(script = "sendPingWithBinaryPayloadOf125Octets")
    @Test(timeout = 1500)
    public void sendPingWithBinaryPayloadOf125Octets() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendPingWithBinaryPayloadOf125OctetsInOctetWiseChops")
    @Test(timeout = 1500)
    public void sendPingWithBinaryPayloadOf125OctetsInOctetWiseChops() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Ignore("KG-12431")
    @Robotic(script = "sendPingWithBinaryPayloadOf126Octets")
    @Test(timeout = 1500)
    public void sendPingWithBinaryPayloadOf126Octets() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendPingWithoutPayload")
    @Test(timeout = 1500)
    public void sendPingWithoutPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendPingWithSmallBinaryPayload")
    @Test(timeout = 1500)
    public void sendPingWithSmallBinaryPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendPingWithSmallTextPayload")
    @Test(timeout = 1500)
    public void sendPingWithSmallTextPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendTenPingsWithPayload")
    @Test(timeout = 1500)
    public void sendTenPingsWithPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendTenPingsWithPayloadInOctetWiseChops")
    @Test(timeout = 1500)
    public void sendTenPingsWithPayloadInOctetWiseChops() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendUnsolicitedPongWithoutPayload")
    @Test(timeout = 1500)
    public void sendUnsolicitedPongWithoutPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendUnsolicitedPongWithPayload")
    @Test(timeout = 1500)
    public void sendUnsolicitedPongWithPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Robotic(script = "sendUnsolicitedPongWithPayloadThenPingWithPayload")
    @Test(timeout = 1500)
    public void sendUnsolicitedPongWithPayloadThenPingWithPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }
}
