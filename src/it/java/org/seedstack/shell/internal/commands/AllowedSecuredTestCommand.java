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
import org.seedstack.seed.security.RequiresRoles;

@CommandDefinition(scope = "test", name = "allowed", description = "Secured test command")
public class AllowedSecuredTestCommand implements Command {
    @Override
    @RequiresRoles("ALLOWED")
    public Object execute(Object object) throws Exception {
        return "allowed";
    }
}
