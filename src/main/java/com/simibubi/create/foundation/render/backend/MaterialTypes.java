package com.simibubi.create.foundation.render.backend;

import com.simibubi.create.foundation.render.backend.core.ModelData;
import com.simibubi.create.foundation.render.backend.core.OrientedData;
import com.simibubi.create.foundation.render.backend.instancing.InstancedModel;

public class MaterialTypes {
	public static final MaterialType<InstancedModel<ModelData>> TRANSFORMED = new MaterialType<>();
	public static final MaterialType<InstancedModel<OrientedData>> ORIENTED = new MaterialType<>();
}
