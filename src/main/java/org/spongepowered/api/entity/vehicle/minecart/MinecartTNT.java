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
package org.spongepowered.api.entity.vehicle.minecart;

import org.spongepowered.api.entity.vehicle.Minecart;

/**
 * Represents a Minecart with a TNT block in it.
 */
public interface MinecartTNT extends Minecart {

    /**
     * Detonates the minecart immediately.
     */
    void detonate();

    /**
     * Triggers the tnt in this minecart to detonate after the fuse time
     * has run out.
     * <p>Normally, the fuse may be set to 80 ticks before detonating.</p>
     */
    void ignite();

    /**
     * Gets the current fuse time in ticks on the tnt block.
     *
     * @return The current fuse time on the tnt block
     */
    int getFuseTime();

    /**
     * Sets the fuse time in ticks on the tnt block.
     *
     * @param fuseTime The new fuse time
     */
    void setFuseTime(int fuseTime);

}