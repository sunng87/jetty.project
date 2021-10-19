package org.eclipse.jetty12.server;

import org.eclipse.jetty12.server.ContextHandler.Context;

public class ScopedRequest extends Request.Wrapper
{
    private final String _pathInContext;
    private final Context _context;

    protected ScopedRequest(Context context, Request wrapped, String pathInContext)
    {
        super(wrapped);
        _pathInContext = pathInContext;
        this._context = context;
    }

    public Context getContext()
    {
        return _context;
    }

    public String getPathInContext()
    {
        return _pathInContext;
    }
}
