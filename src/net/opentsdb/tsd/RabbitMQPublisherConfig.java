package net.opentsdb.tsd;

import java.util.Map;

import net.opentsdb.utils.Config;

public final class RabbitMQPublisherConfig extends Config {

  public RabbitMQPublisherConfig(final Config parent) {
    super(parent);
  }
  
  @Override
  protected void setDefaults() {
    
    default_map.put("tsd.rtpublisher.rabbitmq.hosts", "");
    default_map.put("tsd.rtpublisher.rabbitmq.port", "5672");
    default_map.put("tsd.rtpublisher.rabbitmq.user", "");
    default_map.put("tsd.rtpublisher.rabbitmq.pass", "");
    default_map.put("tsd.rtpublisher.rabbitmq.vhost", "opentsdb");
    default_map.put("tsd.rtpublisher.rabbitmq.exchange.dps", "datapoints");
    
    for (Map.Entry<String, String> entry : default_map.entrySet()) {
      if (!properties.containsKey(entry.getKey()))
        properties.put(entry.getKey(), entry.getValue());
    }
  }
}
