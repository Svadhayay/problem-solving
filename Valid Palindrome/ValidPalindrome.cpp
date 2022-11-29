string str = "";
for (int i = 0; i < s.length(); i++)
{
    if (isalnum(s[i]))
    {
        str += tolower(s[i]);
    }
}
int l = 0, h = str.length() - 1;

while (l < h)
{
    if (str[l++] != str[h--])
    {
        return 0;
    }
}
return 1;