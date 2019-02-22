package com.dliu.refactoring;

import org.apache.log4j.*;

import java.io.StringWriter;

public class GenericTestUtils {
    public static class LogCapturer {
        private final WriterAppender appender;
        private StringWriter sw = new StringWriter();
        private Logger logger;


        public LogCapturer(Logger logger) {
            this.logger = logger;
            Appender defaultAppender = logger.getRootLogger().getAppender("stdout");
            if (defaultAppender == null) {
                defaultAppender = logger.getRootLogger().getAppender("conosle");
            }

            final Layout layout = defaultAppender == null ? new PatternLayout() : defaultAppender.getLayout();
            this.appender = new WriterAppender(layout, sw);
            logger.addAppender(this.appender);
        }

        public static LogCapturer captureLogs(org.slf4j.Logger logger) {
            return new LogCapturer(LogManager.getLogger(logger.getName()));
        }

        public String getOutput() {
            return sw.toString();
        }

        public void stopCapturing() {
            this.logger.removeAppender(this.appender);
        }

        public void clearOutput() {
            sw.getBuffer().setLength(0);
        }
    }
}
