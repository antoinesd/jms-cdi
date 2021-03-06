package fr.sewatech.jms.cdi.connector;

import fr.sewatech.jms.cdi.api.JmsInboundTopic;

import javax.enterprise.util.AnnotationLiteral;

class TopicAnnotationLiteral extends AnnotationLiteral<JmsInboundTopic> implements JmsInboundTopic {
    private String value;

    TopicAnnotationLiteral(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

}
