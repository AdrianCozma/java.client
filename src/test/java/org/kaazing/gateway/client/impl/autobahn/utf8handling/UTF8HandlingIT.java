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

package org.kaazing.gateway.client.impl.autobahn.utf8handling;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.rules.RuleChain.outerRule;

import java.net.URI;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.kaazing.k3po.junit.annotation.Specification;
import org.kaazing.k3po.junit.rules.K3poRule;
import org.kaazing.net.ws.WebSocket;
import org.kaazing.net.ws.WebSocketFactory;
import org.kaazing.net.ws.WebSocketMessageReader;
import org.kaazing.net.ws.WebSocketMessageWriter;

public class UTF8HandlingIT {
	private final K3poRule k3po = new K3poRule();

	private final TestRule timeout = new DisableOnDebug(new Timeout(5, SECONDS));

	@Rule
	public final TestRule chain = outerRule(k3po).around(timeout);

    @Specification("sendTextMessageOfLengthZero")
    @Test(timeout = 1500)
    public void sendTextMessageOfLengthZero() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadIn3Chops")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadIn3Chops() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadIn3Chops2")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadIn3Chops2() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadIn3Fragments")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadIn3Fragments() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadIn3Fragments2")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadIn3Fragments2() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment2")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment2() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment3")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment3() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment4")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment4() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment5")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment5() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment6")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment6() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment7")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment7() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment8")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment8() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment9")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment9() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment10")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment10() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment11")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment11() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment12")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment12() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment13")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment13() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment14")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment14() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment15")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment15() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment16")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment16() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment17")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment17() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment18")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment18() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment19")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment19() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment20")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment20() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment21")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment21() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment22")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment22() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment23")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment23() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment24")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment24() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment25")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment25() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment26")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment26() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment27")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment27() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment28")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment28() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment29")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment29() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment30")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment30() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment31")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment31() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment32")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment32() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment33")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment33() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment34")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment34() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment35")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment35() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment36")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment36() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment37")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment37() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment38")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment38() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment39")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment39() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment40")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment40() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment41")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment41() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment42")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment42() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment43")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment43() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment44")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment44() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment45")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment45() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment46")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment46() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment47")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment47() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment48")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment48() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment49")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment49() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment50")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment50() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment51")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment51() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment52")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment52() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment53")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment53() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment54")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment54() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment55")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment55() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment56")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment56() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment57")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment57() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment58")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment58() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment59")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment59() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment60")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment60() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment61")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment61() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment62")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment62() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment63")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment63() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment64")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment64() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment65")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment65() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment66")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment66() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment67")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment67() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment68")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment68() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment69")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment69() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneFragment70")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneFragment70() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Ignore("KG-12447 and KG-12464")
    @Specification("sendTextMessageWithInvalidUTF8PayloadInOneOctetFragments")
    @Test(timeout = 1500)
    public void sendTextMessageWithInvalidUTF8PayloadInOneOctetFragments() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);
        webSocket.connect();
        k3po.finish();
    }

    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment2")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment2() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment3")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment3() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment4")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment4() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment5")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment5() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment6")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment6() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment7")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment7() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment8")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment8() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment9")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment9() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment10")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment10() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment11")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment11() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment12")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment12() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment13")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment13() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment14")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment14() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment15")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment15() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment16")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment16() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment17")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment17() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment18")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment18() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment19")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment19() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment20")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment20() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment21")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment21() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment22")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment22() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment23")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment23() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment24")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment24() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment25")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment25() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment26")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment26() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment27")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment27() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment28")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment28() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment29")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment29() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment30")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment30() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment31")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment31() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment32")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment32() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment33")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment33() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment34")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment34() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment35")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment35() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment36")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment36() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment37")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment37() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment38")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment38() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment39")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment39() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment40")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment40() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment41")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment41() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment42")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment42() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment43")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment43() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment44")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment44() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment45")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment45() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment46")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment46() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment47")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment47() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment48")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment48() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment49")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment49() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment50")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment50() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment51")
    @Test(timeout = 1000)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment51() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment52")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment52() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment53")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment53() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment54")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment54() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment55")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment55() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment56")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment56() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12463")
    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment57")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment57() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment58")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment58() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment59")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment59() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment60")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment60() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment61")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment61() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment62")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment62() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment63")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment63() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }


    @Specification("sendTextMessageWithValidUTF8PayloadInOneFragment64")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneFragment64() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12447")
    @Specification("sendTextMessageWithValidUTF8PayloadInOneOctetFragments")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneOctetFragments() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12447")
    @Specification("sendTextMessageWithValidUTF8PayloadInOneOctetFragments2")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInOneOctetFragments2() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12447")
    @Specification("sendTextMessageWithValidUTF8PayloadInTwoFragmentsFragmentedOnCodePointBoundary")
    @Test(timeout = 1500)
    public void sendTextMessageWithValidUTF8PayloadInTwoFragmentsFragmentedOnCodePointBoundary() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12447")
    @Specification("sendThreeFragmentedTextMessagesFirstAndLastLengthZeroMiddleNonEmpty")
    @Test(timeout = 1500)
    public void sendThreeFragmentedTextMessagesFirstAndLastLengthZeroMiddleNonEmpty() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }

    @Ignore("KG-12447")
    @Specification("sendThreeFragmentedTextMessagesOfLengthZero")
    @Test(timeout = 1500)
    public void sendThreeFragmentedTextMessagesOfLengthZero() throws Exception {
        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        k3po.finish();
    }
}
