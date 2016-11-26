package com.yingu.consumer.hytrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.yingu.consumer.rpc.SampleClient;

@Component
public class SampleClientHystrix implements SampleClient{

	@Override
	public Integer add(@RequestParam(value = "a")Integer a, @RequestParam(value = "b")Integer b) {
		return -9999;
	}

}
