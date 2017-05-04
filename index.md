---
title: "Shell"
repo: "https://github.com/seedstack/shell-addon"
author: Adrien LAUER
description: "Provides SSH access to application adminitrative commands" 
tags:
    - cli
zones:
    - Addons
menu:
    AddonShell:
        weight: 10
---

SeedStack shell add-on provides access to application administrative commands through SSH protocol in two different modes:

* Interactive mode consists in providing of a simple line-based shell with auto-completion, history and the ability to display
command results as a string. In this mode, commands have no access to low-level input, output and error streams. They
take and produce discrete objects that are displayed as strings.
* Direct mode consists of a single command executed through an ssh remote invocation. In this mode, commands have
access to low-level input, output and error streams and thus can be combined with other commands on the client system.

{{% callout info %}}
While the SSH protocol is used by this add-on, please note that it can only access to internal application commands. **No
system access is possible from this shell.**
{{% /callout %}}

# Dependency 

{{< dependency g="org.seedstack.addons.shell" a="shell" >}}

# Configuration

Shell access can be configured with the following options:

{{% config p="shell" %}}
```yaml
shell:
  # If true, shell access will be enabled (defaults to false)
  enabled: (boolean)
  # Port the shell is listening on  (defaults to 2222)
  port: (int)
  # SSH key configuration
  key:
    # The type of the key to use
    type: (GENERATED|FILE|RESOURCE)
    # The location of the key if a file or resource type is used
    location: (String)
```
{{% /config %}}

{{% callout warning %}}
Don't use a generated key in a production environment as this is NOT secured from an SSH perspective.  
{{% /callout %}}

{{% callout info %}}
When the key is stored in a file or a classpath resource location, it must be in a JCE serialized format.
{{% /callout %}}

# Usage

Use your preferred SSH client to connect to the configured port. All commands registered in the {{< java "org.seedstack.seed.command.CommandRegistry" >}} 
can be invoked from both interactive and direct modes. You can specify command name, arguments and options using a GNU-like syntax:

    [scope:]cmdname -s -sval --long-option --long-option-with-arg=argval arg0 arg1 arg2
    
Note that:
    
* The command scope must be specified as a prefix of the command name, delimited by a colon character.
* Short options are specified using the dash character (-) immediately followed by the option name and a value if needed.
* Long options are specified with two dash characters (--) immediately followed by the option name and, if required, an equal sign with a value.
* Arguments are specified respecting the command arguments order.
