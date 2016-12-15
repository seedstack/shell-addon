/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.shell.internal;

import org.seedstack.seed.command.Command;
import org.seedstack.shell.internal.commands.JsonCommand;
import org.seedstack.shell.internal.commands.StrCommand;

enum OutputMode {
    JSON(new JsonCommand()),
    STRING(new StrCommand());

    private Command command;

    OutputMode(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
