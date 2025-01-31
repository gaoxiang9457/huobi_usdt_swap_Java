package com.huobi.common;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.alibaba.fastjson.JSON;
import org.slf4j.helpers.MessageFormatter;

import java.util.stream.Stream;

public class ArgumentJsonFormatLayout extends MessageConverter {
    public String convert(ILoggingEvent event) {
        try {
            return MessageFormatter.arrayFormat(event.getMessage(), Stream.of(event.getArgumentArray())
                    .map(x -> {
                        if (!(x instanceof String)) {
                            return JSON.toJSONString(x);
                        }
                        return x;
                    }).toArray()).getMessage();
        } catch (Exception e) {
            return event.getMessage();
        }
    }
}
