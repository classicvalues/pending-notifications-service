/**
 * Copyright (C) 2016, TomTom International BV (http://www.tomtom.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tomtom.services.notifications.dao.mappers;

import com.tomtom.speedtools.mongodb.mappers.MapperRegistry;
import com.tomtom.speedtools.mongodb.mappers.SchemaException;

/**
 * This class registers all database object to domain object mappers.
 *
 * The SpeedTools library includes a registry for all standard mappers for data types like
 * Strings and Collections. This registry only needs to extend it with the mapper(s) we
 * define here.
 */
public class NotificationsMapperRegistry extends MapperRegistry {

    public NotificationsMapperRegistry() throws SchemaException {
        super();

        // There's only one mapper to add, for notifications.
        register(new NotificationMapper());
    }
}