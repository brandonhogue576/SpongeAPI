/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.entity.projectile;

import org.spongepowered.api.math.Vector3d;

/**
 * Represents an Eye of Ender.
 */
public interface EyeOfEnder extends Projectile {

    /**
     * Gets the target location this eye is flying towards.
     *
     * @return The location this eye is flying towards
     */
    Vector3d getTargetedLocation();

    /**
     * Sets the target location this eye will fly towards.
     *
     * @param vector3d The target location for this eye to fly towards
     */
    void setTargetedLocation(Vector3d vector3d);

    /**
     * Returns whether this eye will shatter or drop a new eye in the
     * form of an {@link org.spongepowered.api.entity.Item}.
     *
     * @return True if this eye will shatter or not
     */
    boolean doesShatterOnDrop();

    /**
     * Sets whether this eye will shatter or drop a new eye in the
     * form of an {@link org.spongepowered.api.entity.Item}.
     *
     * @param shatterOnDrop Whether this eye will shatter or not
     */
    void setShatterOnDrop(boolean shatterOnDrop);

}
