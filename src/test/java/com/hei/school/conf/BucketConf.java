package com.hei.school.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.hei.school.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
