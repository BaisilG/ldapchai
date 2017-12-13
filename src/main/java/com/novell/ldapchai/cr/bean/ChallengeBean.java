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

package com.novell.ldapchai.cr.bean;

import java.io.Serializable;

public class ChallengeBean implements Serializable
{
    public String challengeText;
    public int minLength;
    public int maxLength;
    public boolean adminDefined;
    public boolean required;
    public int maxQuestionCharsInAnswer;
    public boolean enforceWordlist;

    public AnswerBean answer;

    public String getChallengeText()
    {
        return challengeText;
    }

    public void setChallengeText( final String challengeText )
    {
        this.challengeText = challengeText;
    }

    public int getMinLength()
    {
        return minLength;
    }

    public void setMinLength( final int minLength )
    {
        this.minLength = minLength;
    }

    public int getMaxLength()
    {
        return maxLength;
    }

    public void setMaxLength( final int maxLength )
    {
        this.maxLength = maxLength;
    }

    public boolean isAdminDefined()
    {
        return adminDefined;
    }

    public void setAdminDefined( final boolean adminDefined )
    {
        this.adminDefined = adminDefined;
    }

    public boolean isRequired()
    {
        return required;
    }

    public void setRequired( final boolean required )
    {
        this.required = required;
    }

    public int getMaxQuestionCharsInAnswer()
    {
        return maxQuestionCharsInAnswer;
    }

    public void setMaxQuestionCharsInAnswer( final int maxQuestionCharsInAnswer )
    {
        this.maxQuestionCharsInAnswer = maxQuestionCharsInAnswer;
    }

    public boolean isEnforceWordlist()
    {
        return enforceWordlist;
    }

    public void setEnforceWordlist( final boolean enforceWordlist )
    {
        this.enforceWordlist = enforceWordlist;
    }

    public AnswerBean getAnswer()
    {
        return answer;
    }

    public void setAnswer( final AnswerBean answer )
    {
        this.answer = answer;
    }
}
