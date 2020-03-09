package com.company.dcp;

import java.util.UUID;

public class DCP300 {

	public UUID getUUID(String str) {
		return UUID.fromString(UUID.nameUUIDFromBytes(str.getBytes()).toString());
	}
}
