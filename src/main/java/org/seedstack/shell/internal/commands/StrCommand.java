/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.shell.internal.commands;

import org.seedstack.seed.command.Command;
import org.seedstack.seed.command.CommandDefinition;

/**
 * This command stringify any input object.
 *
 * @author adrien.lauer@mpsa.com
 */
@CommandDefinition(scope = "", name = "str", description = "Return the argument as a string")
public class StrCommand implements Command {
    @Override
    public Object execute(Object object) throws Exception {
        if (object != null) {
            return object.toString();
        } else {
            return null;
        }
    }
}
