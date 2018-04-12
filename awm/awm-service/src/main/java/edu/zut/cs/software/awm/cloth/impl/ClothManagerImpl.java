package edu.zut.cs.software.awm.cloth.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.zut.cs.software.awm.cloth.ClothManager;
@Component
public class ClothManagerImpl implements ClothManager {
  
	@Override
	public List<Object> getAll() {
		List<Object> result = new ArrayList<Object>();
		return result;
	}

}
