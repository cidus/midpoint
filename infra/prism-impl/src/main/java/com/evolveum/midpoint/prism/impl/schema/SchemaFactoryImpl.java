/*
 * Copyright (c) 2010-2018 Evolveum
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.evolveum.midpoint.prism.impl.schema;

import com.evolveum.midpoint.prism.PrismContext;
import com.evolveum.midpoint.prism.schema.MutablePrismSchema;
import com.evolveum.midpoint.prism.schema.SchemaFactory;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class SchemaFactoryImpl implements SchemaFactory {

	@NotNull private final PrismContext prismContext;

	public SchemaFactoryImpl(@NotNull PrismContext prismContext) {
		this.prismContext = prismContext;
	}

	@Override
	public MutablePrismSchema createPrismSchema() {
		return new PrismSchemaImpl(prismContext);
	}

	@Override
	public MutablePrismSchema createPrismSchema(String namespace) {
		return new PrismSchemaImpl(namespace, prismContext);
	}
}
