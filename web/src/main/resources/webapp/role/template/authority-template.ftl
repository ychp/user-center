<#macro role_authority_from >
<div class="modal fade" id="roleAuthorityModal" tabindex="-1" role="dialog" aria-labelledby="addModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">权限管理</h4>
            </div>
            <div class="modal-body auth-info">
            </div>
            <div class="modal-footer auth-grant-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary js-grant-auth">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script src="/static/js/role/role-authority.js"></script>
</#macro>