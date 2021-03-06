/*
 * LDAP Chai API
 * Copyright (c) 2006-2017 Novell, Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package com.novell.ldapchai.tests;

import com.novell.ldapchai.provider.ChaiSetting;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class ChaiConfigTester extends TestCase {

    public void testUniqueSettingKeys()
            throws Exception
    {
        final int settingCount = ChaiSetting.values().length;
        final Set<String> settingPropNames = new HashSet<String>();
        for (final ChaiSetting setting : ChaiSetting.values()) {
            settingPropNames.add(setting.getKey());
        }

        Assert.assertEquals(settingCount, settingPropNames.size());
    }


    public void testValidatedDefalts()
            throws Exception
    {
        for (final ChaiSetting setting : ChaiSetting.values()) {
            setting.validateValue(setting.getDefaultValue());
        }
    }
}
