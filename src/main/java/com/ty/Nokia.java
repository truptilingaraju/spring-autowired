package com.ty;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Nokia implements Mobile {

	public void text() {
		System.out.println("nokia is texting");
	}
}
