/*
 * Copyright 2015-2016 Ben Ashford
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

package jresp;

import java.io.IOException;
import java.util.Collection;

public class ShutdownException extends IOException {
    private Collection<IOException> exceptions;

    public ShutdownException(Collection<IOException> e) {
        super(String.format("Multiple (%d) exceptions", e.size()));
        exceptions = e;
    }
}
