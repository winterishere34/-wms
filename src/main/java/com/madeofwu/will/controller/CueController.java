package com.madeofwu.will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CueController {
	@RequestMapping("/cue/successbuy")
	public String BuySuccess() {
		return "/cue/successbuy";
	}
	@RequestMapping("/cue/404")
	public String Fail() {
		return "/cue/404";
	}
	@RequestMapping("/cue/successreturn")
	public String ReturnSuccess() {
		return "/cue/successreturn";
	}
	@RequestMapping("/cue/returnfail")
	public String ReturnFail() {
		return "/cue/returnfail";
	}
	@RequestMapping("/cue/buyfail")
	public String BuyFail() {
		return "/cue/buyfail";
	}
	@RequestMapping("/cue/AccountRecordsfail")
	public String AccountRecordsFail() {
		return "/cue/AccountRecordsfail";
	}
}
