/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fernandocejas.android10.sample.data.cache;

import com.fernandocejas.android10.sample.data.entity.UserEntity;
import io.reactivex.Observable;

/**
 * An interface representing a user Cache.
 * 表示用户缓存的接口。
 */
public interface UserCache {
  /**
   * Gets an {@link Observable} which will emit a {@link UserEntity}.
   *
   * @param userId The user id to retrieve data.
   *               用于检索数据的用户标识。
   */
  Observable<UserEntity> get(final int userId);

  /**
   * Puts and element into the cache.
   * 将元素放入缓存中
   * @param userEntity Element to insert in the cache.
   *                   userEntity元素插入到缓存中。
   */
  void put(UserEntity userEntity);

  /**
   * Checks if an element (User) exists in the cache.
   * 检查缓存中是否存在元素（User）。
   * @param userId The id used to look for inside the cache.
   *               用于在缓存中查找的id。
   * @return true if the element is cached, otherwise false.
   * 如果元素被缓存返回true，否则返回false。
   */
  boolean isCached(final int userId);

  /**
   * Checks if the cache is expired.
   * 检查缓存是否过期。
   * @return true, the cache is expired, otherwise false.
   * 返回true，缓存已过期，否则为false。
   */
  boolean isExpired();

  /**
   * Evict all elements of the cache.
   * 排除缓存的所有元素。
   */
  void evictAll();
}
