package com.naver.model02;

import com.naver.model01.IShapeClass;

public class Rect2 implements IShapeClass {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}

}
