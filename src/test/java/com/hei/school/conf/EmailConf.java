package com.hei.school.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.hei.school.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
